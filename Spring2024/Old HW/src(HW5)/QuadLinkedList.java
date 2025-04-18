/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//package net.datastructures;

/**
 * A basic doubly linked list implementation.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class QuadLinkedList {

  //---------------- nested Node class ----------------
  /**
   * Node of a doubly linked list, which stores a reference to its
   * element and to both the previous and next node in the list.
   */
  static class Node {

    /** The element stored at this node */
    public Integer key;
    public String value;               // reference to the element stored at this node

    /** A reference to the preceding node in the list */
    public Node prev;            // reference to the previous node in the list

    /** A reference to the subsequent node in the list */
    public Node next;  
    
    public Node top;

    public Node bot;

    /**
     * Creates a node with the given element and next node.
     *
     * @param e  the element to be stored
     * @param p  reference to a node that should precede the new node
     * @param n  reference to a node that should follow the new node
     */
    public Node(Integer key, String value, Node p, Node n ,Node t, Node b) {
      this.key = key;
      this.value = value;
      prev = p;
      next = n;
      top = t;
      bot = b;
    }

    
    public Node getPrev() { return prev; }

    public Node getNext() { return next; }

    public void setPrev(Node p) { prev = p; }

    public void setNext(Node n) { next = n; }

    public Node getTop() { return top; }

    public Node getBot() { return bot; }

    public void setTop(Node p) { top = p; }

    public void setBot(Node n) { bot = n; }
  } //----------- end of nested Node class -----------

  // instance variables of the DoublyLinkedList
  /** Sentinel node at the beginning of the list */
  public Node header;                    // header sentinel

  /** Sentinel node at the end of the list */
  public Node trailer;                   // trailer sentinel

  /** Constructs a new empty list. */
  public QuadLinkedList() {
    header = new Node(Integer.MIN_VALUE, "-infdog", null, null, null, null);      // create header
    trailer = new Node(Integer.MAX_VALUE, "+infdog", header, null, null, null);   // trailer is preceded by header
    header.next = trailer;                    // header is followed by trailer
  }
  public QuadLinkedList(QuadLinkedList ball) {
    header = new Node(Integer.MIN_VALUE, "-infdog", null, null, null, ball.header);      // create header
    trailer = new Node(Integer.MAX_VALUE, "+infdog", header, null, null, ball.trailer);   // trailer is preceded by header
    header.setNext(trailer);                    // header is followed by trailer
  }


  public boolean isEmpty() { return header.next == trailer; }
  public boolean isEmpty2() { return trailer.prev == header; }

  /**
   * Returns (but does not remove) the first element of the list.
   * @return element at the front of the list (or null if empty)
   */
  public String first() {
    if (isEmpty()) return null;
    return header.getNext().value;   // first element is beyond header
  }

  /**
   * Returns (but does not remove) the last element of the list.
   * @return element at the end of the list (or null if empty)
   */
  public String last() {
    if (isEmpty()) return null;
    return trailer.getPrev().value;    // last element is before trailer
  }

  // public update methods
  /**
   * Adds an element to the front of the list.
   * @param e   the new element to add
   */
  public void addFirst(Integer k, String v) {
    addBetween(k, v, header, header.getNext(), null, null);    // place just after the header
  }

  /**
   * Adds an element to the end of the list.
   * @param e   the new element to add
   */
  public void addLast(int ky, String vl) {
    addBetween(ky, vl, trailer.getPrev(), trailer, null, null);  // place just before the trailer
  }

  /**
   * Removes and returns the first element of the list.
   * @return the removed element (or null if empty)
   */
  public void removeFirst() {
    if (isEmpty()) return ;                  // nothing to remove
    remove(header.getNext());             // first element is beyond header
  }

  /**
   * Removes and returns the last element of the list.
   * @return the removed element (or null if empty)
   */
  public void removeLast() {
    if (isEmpty()) return;                  // nothing to remove
    remove(trailer.getPrev());            // last element is before trailer
  }

  // private update methods
  /**
   * Adds an element to the linked list in between the given nodes.
   * The given predecessor and successor should be neighboring each
   * other prior to the call.
   *
   * @param predecessor   node just before the location where the new element is inserted
   * @param successor     node just after the location where the new element is inserted
   */
  public Node addBetween(int k, String v, Node predecessor, Node successor, Node dom, Node sub) {
    // create and link a new node
    Node newest = new Node(k, v, predecessor, successor, null, null);
	  predecessor.setNext(newest);
	  successor.setPrev(newest);
	  return newest;
  }
  public void addBetween(Node addy, Node predecessor, Node successor, Node dom, Node sub) {
    // create and link a new node
    predecessor.setNext(addy);
    successor.setPrev(addy);
    addy.setNext(successor);
    addy.setPrev(predecessor);
  }

  /**
   * Removes the given node from the list and returns its element.
   * @param node    the node to be removed (must not be a sentinel)
   */
  public void remove(Node node) {
    while (node != null) {
        Node nexttr = null;
        if (node.getBot() != null) {
            nexttr = node.getBot();
        }
        Node predecessor = node.getPrev();
        Node successor = node.getNext();

        // Update links to remove the node from the QuadLinkedList
        if (predecessor != null) { // Check if predecessor is not null
            predecessor.setNext(successor);
        }
        if (successor != null) { // Check if successor is not null
            successor.setPrev(predecessor);
        }

        // Clear links from the removed node
        node.setTop(null);
        node.setBot(null);

        // Move to the next node to be removed
        node = nexttr;
    }
  }


  /**
   * Produces a string representation of the contents of the list.
   * This exists for debugging purposes only.
   */
  public String toString() {
    StringBuilder sb = new StringBuilder("(");
    Node walk = header.getNext();
    while (walk != trailer) {
      sb.append(walk.value);
      walk = walk.getNext();
      if (walk != trailer)
        sb.append(", ");
    }
    sb.append(")");
    return sb.toString();
  }
} //----------- end of DoublyLinkedList class -----------

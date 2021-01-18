/**
  * Question => How would you implement a binary search tree (BST) in Scala? Give the trait, (case) class
    and/or subclass definitions that you would write, without the functions for manipulating the
    tree: just the data model.
  */

trait BinarySearchTreee[+A] {
  def value: Option[A] = this match {
    case n: Node[A] => Some(n.v)
    case l: Leaf[A] => Some(l.v)
    case Empty      => None
  }

  def left: Option[BinarySearchTreee[A]] = this match {
    case n: Node[A] => Some(n.l)
    case l: Leaf[A] => None
    case Empty      => None
  }

  def right: Option[BinarySearchTreee[A]] = this match {
    case n: Node[A] => Some(n.r)
    case l: Leaf[A] => None
    case Empty      => None
  }
}

case class Node[A](v: A, l: BinarySearchTreee[A], r: BinarySearchTreee[A]) extends BinarySearchTreee[A]
case class Leaf[A](v: A) extends BinarySearchTreee[A]
case object Empty extends BinarySearchTreee[Nothing]
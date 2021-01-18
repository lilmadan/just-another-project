Question - Would this class structure be different if you would have implemented them in a non-
functional language like Java, Python, Go or C? In what sense?

Implmementation of Binary Search Tree model in Other Languages.

Intentionally using Typescript as I can ask for some guidance for the same


class TreeNode {

  private _nodeValue: number;
  public get nodeValue(): number {
    return this._nodeValue;
  }
  public set _nodeValue(value: number) {
    this._nodeValue = value;
  }

  
  private _left: TreeNode;
  public get left(): TreeNode {
    return this._left;
  }
  public set left(node: TreeNode) {
    this._left = node;
  }

  
  private _right: TreeNode;
  public get right(): TreeNode {
    return this._right;
  }
  public set right(v: TreeNode) {
    this._right = v;
  }

  
  constructor(value: number) {
    this._nodeValue = value;
    this._left = null;
    this._right = null;
  }
}

// Implementation in Java

class TreeNode {

  private int nodeValue;
  private TreeNode left;
  private TreeNode right;

  public int getNodeValue() {
      return this.nodeValue;
  }

  public void setNodeValue(int nodeValue) {
    this.nodeValue = nodeValue;
  }

  public TreeNode getLeft() {
    return this.left;
  }
  public void setLeft(TreeNode left) {
    this.left = left;
  }
  
  public TreeNode getRight() {
    return this.right;
  }
  public void setRight(TreeNode right) {
    this.right = right;
  }

  
  TreeNode(int value) {
    this.nodeValue = value;
    this.left = null;
    this.right = null;
  }
}
public class Node
{
    private Node leftChild, rightChild;
    private String question;
    private boolean answer;
    private int pointValue;
    
    public Node (String question, boolean answer, int pointValue, Node leftChild, Node rightChild)
    {
        this.question = question;
        this.answer = answer;
        this.pointValue = pointValue;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public Node getLeft()
    {
        return leftChild;
    }
    public Node getRight()
    {
        return rightChild;
    }
    public Boolean getAnswer()
    {
        return answer;
    }
    public String getQuestion()
    {
      return question;
    }
    public int getPointValue()
    {
      return pointValue;
    }
    public void setLeft(Node left)
    {
        leftChild = left;
    }
    public void setRight(Node right)
    {
        rightChild = right;
    }
    public boolean isCorrect(boolean Answer)
    {
        if (getAnswer() == Answer)
            return true;
        return false;
    }
}
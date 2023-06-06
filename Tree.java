public class Tree
{
  private Node root;
  private Node temp;
  private int score;

  public Tree()
  {
    root = null;
    score = 0;
    temp = root;
  }
 
  public Node updateQuestion(Node currentNode, boolean Answer)
  {
    if (currentNode.isCorrect(Answer) )
    {
      if (currentNode.getRight() != null)
      {
        increasePoints(currentNode, Answer);
        System.out.println("Correct, new score is " + score + " points!");
        currentNode = currentNode.getRight();
      }
      else
      {
        increasePoints(currentNode, Answer);
        System.out.println("Correct, new score is " + score + " points!");
        System.out.println("Your score for this level was " + score);
      }
      
    }
    else
    {
      if (currentNode.getLeft() != null)
      {
        System.out.println("Incorrect, no points added.");
        currentNode  = currentNode.getLeft();
      }
      else
      {
        System.out.println("Incorrect, no points added.");
        System.out.println("Your score for this level was " + score);
      }
      
    }
    return currentNode;
  }
  public int increasePoints(Node currentNode, boolean Answer)
  {
    if (currentNode.getRight() == null)
    {
      if (currentNode.isCorrect(Answer))
      {
        score += currentNode.getPointValue() + 1;
      }
    }
    else if (currentNode.isCorrect(Answer))
    {
      score += currentNode.getRight().getPointValue();
    }
    return score;
  }

  

  public void addRoot(Node n)
  {
    root = n;
  }
  public Node getRoot()
  {
    return root;
  }
}

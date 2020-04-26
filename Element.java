
public class Element implements Comparable<Element>
{
  int index;
  double value;

  public Element(int i, double v)
  {
	 this.index =i;
	 this.value = v;
  }

  public int getIndex()
  {
	  return index;
  }

  public double getValue()
  {
	  	return value;
  }

  public void setIndex(int i)
  {
	  i = index;
  }

  public void setValue(double v)
  {
	  	v = value;
  }

  public int compareTo(Element e)
  {
	  return ("[" + index + ", " + value + "]").compareTo("[" + e.index + ", " + e.value + "]");
  }

  public String toString()
  {
	  return "[" + this.index + "," + this.value + "]";
  }
}

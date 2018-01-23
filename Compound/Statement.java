package compound;
import primitives;

public class Statement{
  private Proposition[] propositions;
  private Operators[] operators;
  
  public Statement(Proposition p [], Operators o []){
    this.propositions = p;
    this.operators = o;
  }


}

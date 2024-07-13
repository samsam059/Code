import java.util.*;
class lowercase{
  public static void main(String[] args){
    Scanner n=new Scanner(System.in);
    String str=n.nextLine();
    StringBuilder d=new StringBuilder();
    for(char ch:str.toCharArray()){
      if(Character.isLowerCase(ch)){
    break;}d.append(ch);}
  System.out.print(d.toString());}
}

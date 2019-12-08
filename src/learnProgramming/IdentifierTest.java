package learnProgramming;

public class IdentifierTest {
    public static void main(String[] args) {
        int X;   // valid identifier
        int 1a;  // not compile as starting with number
        int _1a;    // valid identifier
        int aaa;    //valid identifier
        int main;   // can compile as main is keyword
        int static; // cannot compile as static is keyword
        int void;   // cannot compile as void is keyword
        int String;  // can compile as String is prefined but can be new identifier
        int 123456a;    //cannot compile
        int $1234567;   // valid identifier
        int _1234567;   // valid identifier
        int 1234567a;   // cannot compile as starts with number

        int do; // not valid, do is a keyword
        int Do; // valid identifier
        int d0; // valid identifier
    }
}

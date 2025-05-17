public class BreakContinueExample {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
if (i == 5) {
continue;
}
if (i == 8) {
break; // Exit the loop when i is 8
}
System.out.println(i);
}
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        float weight;
        final float FEETUINT = 0.0328084f;
        final float POUNDUNIT = 2.20462f;
        float feet, pound;  // 정보


        System.out.printf("당신의 키 입력 (170.3 Cm) : ");
        height = keyboard.nextFloat();
        System.out.printf("당신의 몸무게 입력 (72.3 Kg) : ");
        weight = keyboard.nextFloat();

        feet = height * FEETUINT;
        pound = weight * POUNDUNIT;


        System.out.printf("당신의 키(%.2f Cm)는 %.2f 피트(feet) 입니다.\n", height, feet);
        System.out.printf("당신의 몸무게(%.2f Kg)는 %.3f 파운드(pound)입니다.\n", weight, pound);

    }
}
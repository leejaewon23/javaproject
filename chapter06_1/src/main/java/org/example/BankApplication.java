package org.example;

import java.util.Scanner;

public class BankApplication {
    private static Account2[] accountArray = new Account2[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) createAccount();
            else if (selectNo == 2) accountList();
            else if (selectNo == 3) deposit();
            else if (selectNo == 4) withdraw();
            else if (selectNo == 5) run = false;
        }
        System.out.println("프로그램 종료");
    }

    // 계좌 생성하기
    private static void createAccount() {
        System.out.println("----------\n계좌생성\n----------");
        System.out.print("계좌번호: "); String ano = scanner.nextLine();
        System.out.print("계좌주: "); String owner = scanner.nextLine();
        System.out.print("초기입금액: "); int balance = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = new Account2(ano, owner, balance);
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌 목록 보기
    private static void accountList() {
        System.out.println("----------\n계좌목록\n----------");
        for (Account2 account : accountArray) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());
            }
        }
    }

    // 예금하기
    private static void deposit() {
        System.out.println("----------\n예금\n----------");
        System.out.print("계좌번호: "); String ano = scanner.nextLine();
        System.out.print("예금액: "); int money = Integer.parseInt(scanner.nextLine());
        Account2 account = findAccount(ano);
        if (account != null) {
            account.setBalance(account.getBalance() + money);
            System.out.println("결과: 예금이 성공되었습니다.");
        }
    }

    // 출금하기
    private static void withdraw() {
        System.out.println("----------\n출금\n----------");
        System.out.print("계좌번호: "); String ano = scanner.nextLine();
        System.out.print("출금액: "); int money = Integer.parseInt(scanner.nextLine());
        Account2 account = findAccount(ano);
        if (account != null) {
            account.setBalance(account.getBalance() - money);
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    // 계좌 찾기 보조 메소드
    private static Account2 findAccount(String ano) {
        for (Account2 account : accountArray) {
            if (account != null && account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
}
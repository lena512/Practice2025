import java.time.LocalDateTime;
//3. Создание класса BankAccount
public class BankAccount {

    String owner_name;//Имя владельца (строка)
    int balance;//Баланс(целочисленный)
    LocalDateTime opening_date;//Дата открытия (LocalDateTime)
    boolean is_blocked;//поле-флажок заблокирован ли счет (boolean)

    //конструктор, который принимает только один параметр - имя владельца.
    public BankAccount(String owner_name){
        this.balance = 0;//начальный баланс 0
        this.is_blocked = false;//счёт не заблокирован
        this.opening_date = LocalDateTime.now();
        this.owner_name = owner_name;
    }

    //Пополнение счёта
    public boolean deposit(int amount){
        if (is_blocked || amount<=0){
            return false;
        }
        balance += amount;
        return true;
    }

    //Снятие денег со счёта
    public boolean withdraw(int amount){
        if (is_blocked || amount<=0){
            return false;
        }
        balance -= amount;
        return true;
    }

    //Перевод денег на другой счёт
    public boolean transfer(BankAccount otherAccount, int amount){
        if (is_blocked || otherAccount.is_blocked || amount<=0 || amount>balance){
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }
    //Геттеры для полей
    public int getBalance(){
        return balance;
    }
    public String getOwner_name(){
        return owner_name;
    }
    public LocalDateTime getOpening_date() {
        return opening_date;
    }
    public boolean getIs_blocked() {
        return is_blocked;
    }
    //Сеттер для is_blocked

    public void setBlocked(boolean is_blocked) {
        this.is_blocked = is_blocked;
    }
}

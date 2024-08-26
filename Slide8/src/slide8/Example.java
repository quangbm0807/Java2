/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8;

/**
 *
 * @author buimi
 */
public class Example<T extends Number> {

    private T number;

    public Example(T number) {
        this.number = number;
    }

    public Example() {
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    //Nghich dao
    public double nghichDao() {
        return 1 / number.doubleValue();
    }

    public double thapPhan() {
        return number.doubleValue() - number.intValue();
    }

    public boolean equals(Example<?> e) {
        if (number.doubleValue() == e.number.doubleValue()) {
            return true;
        } else {
            return false;
        }
    }
}

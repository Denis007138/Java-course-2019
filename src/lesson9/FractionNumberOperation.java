package lesson9;

/**
 * Интерфейс операций с числами FractionNumber. Для вывода ошибок функции могут бросать ArithmeticException
 * 
 * @author nedis
 * @version 1.0
 */
public interface FractionNumberOperation {
	
	/**
	 * Сложение двух чисел FractionNumber
	 * 
	 * @param a первое слагаемое
	 * @param b второе слагаемое
	 * @throws NullPointerException если а или b равны null
	 * @return
	 */
	FractionNumberImpl add (FractionNumber a, FractionNumber b) throws NullPointerException;
	
	/**
	 * Вычитание двух чисел FractionNumber
	 * 
	 * @param a уменьшаемое
	 * @param b вычитаемое
	 * @return результат в виде числа FractionNumber
	 * @throws NullPointerException если а или b равны null
	 */
	FractionNumberImpl sub (FractionNumber a, FractionNumber b) throws NullPointerException;
	
	/**
	 * Умножение двух чисел FractionNumber
	 * 
	 * @param a первый множитель
	 * @param b второй множитель
	 * @return результат в виде числа FractionNumber
	 * @throws NullPointerException если а или b равны null
	 */
	FractionNumberImpl mul (FractionNumber a, FractionNumber b) throws NullPointerException;
	
	/**
	 * Деление двух чисел FractionNumber
	 * 
	 * @param a делимое
	 * @param b делитель
	 * @return результат в виде числа FractionNumber
	 * @throws NullPointerException если а или b равны null
	 * @throws ArithmeticException в случае если происходит деление на 0
	 */
	FractionNumberImpl div (FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException;
}

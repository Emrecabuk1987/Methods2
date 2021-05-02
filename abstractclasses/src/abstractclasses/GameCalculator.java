package abstractclasses;

public abstract class  GameCalculator {

	public abstract void hesapla();
/*abstract işaretlenen metodlar,o sınıfı inherit eden
sınıflar tarafından override(ezilerek) kullanılmak zorundadır.
abstract olan sınıflarda , abstract metodlar kullanılmak zorunda değildir.
abstract sınıfta hem abstract metod hemde ,normal metod olabilir.
abstract sınıflar asla new'lenemez
abstract sınıflar new lenebilmesi için metodlarının ezilmesi gerekir ama doğru kullanım değildir
*
*/	
	
	 	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

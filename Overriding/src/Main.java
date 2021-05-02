
public class Main {

	public static void main(String[] args) {
		BaseKrediManager [] krediManagers = new BaseKrediManager[]
				{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		for (BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}


//classlar'ın default'u overridable(üzerine yazılabilir,referans aldığı sınıf ezebilir.)
// public'den sonra final konulur ise overriding engellenmiş olur ,miras aldığı sınıfı ezemez
package day14;

import java.util.function.Consumer;

public class ConsumEx01 {

	public static void main(String[] args) {

		Consumer<String> consumer = t -> System.out.println(t+"8");
								//void accept(T t)
		consumer.accept("java");
		
	}

}

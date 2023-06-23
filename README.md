# DesafioDevSuperior
Desafio proposto no curso de SpringBoot da escola DevSuperior com o Prof°Nélio Alves

```java

@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		Order order2 = new Order(2282, 800.00, 10.0);
		Order order3 = new Order(1309, 95.90, 0.0);

		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order1.getCode() + "\n");
		System.out.println("Valor total: R$ " +
		String.format("%.2f", orderService.total(order1)));
		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order2.getCode() + "\n");
		System.out.println("Valor total: R$ " + 
		String.format("%.2f", orderService.total(order2)));
		System.out.println("__________________________________________________________");
		System.out.print("Número do pedido: " + order3.getCode() + "\n");
		System.out.println("Valor total: R$ " + 
		String.format("%.2f", orderService.total(order3)));

	}
 ```

---
Durante nosso aprendizado sobre injeção de dependências, utilizamos a framework Spring Boot para entender conceitos fundamentais. 
Exploramos anotações importantes, como @Autowired, @Service e @Command, entre outras.


 

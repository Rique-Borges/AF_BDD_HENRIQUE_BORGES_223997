package conta;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class ContaSteps {
    Conta conta;

    @Given("a customer wants to rent a luxury car")
    public void a_customer_wants_to_rent_a_luxury_car() {
        conta = new Conta(true, false, 1000.0);
    }

    @Given("the reservation is made at least one week in advance")
    public void the_reservation_is_made_at_least_one_week_in_advance() {
        // Implementação para simular uma reserva feita com pelo menos uma semana de antecedência
    }

    @When("the customer finalizes the booking")
    public void the_customer_finalizes_the_booking() {
        conta.applyDiscount(); // Aplicar desconto se aplicável
        conta.processUrgentRental(); // Processar locação urgente, se aplicável
        // Implementação para simular o cliente finalizando a reserva
    }

    @Then("the system should offer a special discount on the total rental price")
    public void the_system_should_offer_a_special_discount_on_the_total_rental_price() {
        // Implementação para verificar se o desconto foi aplicado corretamente
        double expectedPriceWithDiscount = 1000.0 - (1000.0 * 0.1); // Desconto de 10%
        assertEquals(expectedPriceWithDiscount, conta.getPrice(), 0.01);
    }

    @Given("a customer wants to rent a utility car")
    public void a_customer_wants_to_rent_a_utility_car() {
        conta = new Conta(false, false, 500.0);
    }

    @Given("the reservation is made on the same day")
    public void the_reservation_is_made_on_the_same_day() {
        // Implementação para simular uma reserva feita no mesmo dia
    }

    @Then("the system should charge a higher price due to the urgent demand")
    public void the_system_should_charge_a_higher_price_due_to_the_urgent_demand() {
        // Implementação para verificar se o sistema cobra um preço mais alto devido à demanda urgente
        double expectedHigherPrice = 500.0 + (500.0 * 0.2); // Acréscimo de 20%
        assertEquals(expectedHigherPrice, conta.getPrice(), 0.01);
    }
}

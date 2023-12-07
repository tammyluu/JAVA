package org.example.stock_observable;

public class Supplier implements Observer {
    @Override
    public void update(Product product) {
        System.out.println(" Supplier : Le niveau Stock du produit "
                + product.getName() + " est maintenant " + product.getStockLevel() + ".");
    }
}

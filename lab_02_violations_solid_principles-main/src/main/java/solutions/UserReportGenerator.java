package solutions;

import violations.User;

public class UserReportGenerator {
    
    private User user;
    private DiscountCalculator discal;

    public UserReportGenerator(User user) {
        this.user = user;
    }
    
    // Responsabilidad 4: Generación de reportes
    public String generateUserReport() {
        return "=== REPORTE DE USUARIO ===\n"
                + "Nombre: " + user.name + "\n"
                + "Email: " + user.email + "\n"
                + "Tipo: " + user.userType + "\n"
                + "Total Compras: $" + user.totalPurchases + "\n"
                + "Descuento Aplicable: " + (discal.calculateDiscount() * 100) + "%\n";
    }
}

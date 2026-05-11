public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        System.out.println(dao.incluir(sql, "Joao da Silva", 1001));
        System.out.println(dao.incluir(sql, "Matheus Cunha", 1002));
        System.out.println(dao.incluir(sql, "Neymar Junior", 1003));

        dao.close();
    }
}

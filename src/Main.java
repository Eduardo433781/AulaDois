
public class Main {
    public static void main(String[] args) {


//        System.out.println("Olá");
//
//        int aumento = 200;
//        int salarioFuncionario = 10;
//
//        System.out.println(aumento + salarioFuncionario);
//        System.out.println(aumento - salarioFuncionario);
//        System.out.println(aumento * salarioFuncionario);
//        System.out.println(aumento / salarioFuncionario);
//
//        double test01 = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.9;
//        float test02 = 99999999999999999999999999999999999999.9f;
//        int test03 = 999999999;

        Funcionario funcionario = new Funcionario();
        System.out.println("O funcionario trabalha no: " + funcionario.empresaFuncionario);
        System.out.println("O salario do funcionario é: " + funcionario.valorSalarioFuncionario);
        System.out.println("O nome do funcionario é: " + funcionario.nomeFuncionario);
        System.out.println("O cargo do funcionario é: " + funcionario.cargoFuncionario);

         //Testando nova Branch
         Funcionario funcionario = new EmpresaSetor();
         System.out.println(EmpresaSetor.nomeSetorRH);
         System.out.println(EmpresaSetor.nomeSetorJuridico)

        Empresa empresa = new Empresa();
        System.out.println(empresa.NomeEmpresa);
        System.out.println(empresa.CNPJEmpresa);
        System.out.println(empresa.TipoEmpresa);
        System.out.println(empresa.EnderecoEmpresa);

    }
}
package CodeWars;

public class StringTest {
    public static void main(String[] args) {

        String imp = "<ImportedPayment xmlns=\"http://roskazna.ru/gisgmp/xsd/Package/2.5.0\" Id=\"I_fbab0722-ffde-11ed-acaa-000c29cafaaf\" supplierBillID=\"32139957805717181842\" paymentId=\"10445256781000013105202300191195\" purpose=\"УИН32139957805717181842///Плата за предоставление сведений из ЕГРН\" amount=\"29000\" paymentDate=\"2023-05-31T21:13:28+03:00\" receiptDate=\"2023-05-31\" kbk=\"00000000000000000130\" oktmo=\"45378000\" transKind=\"01\"><PaymentOrg xmlns=\"http://roskazna.ru/gisgmp/xsd/Payment/2.5.0\"><Bank xmlns=\"http://roskazna.ru/gisgmp/xsd/Organization/2.5.0\" bik=\"044525678\"></Bank></PaymentOrg><Payer xmlns=\"http://roskazna.ru/gisgmp/xsd/Payment/2.5.0\" payerIdentifier=\"1020000000000XАЯ123456\" payerName=\"ООО НКО «МОБИ.ДЕНЬГИ»//тест виктория//\"></Payer><Payee xmlns=\"http://roskazna.ru/gisgmp/xsd/Organization/2.5.0\" name=\"ФГБУ «ФКП Росреестра» по г Москва\" inn=\"7705401340\" kpp=\"770801001\"><OrgAccount xmlns=\"http://roskazna.ru/gisgmp/xsd/Common/2.5.0\" accountNumber=\"03262643000000089500\"><Bank xmlns=\"http://roskazna.ru/gisgmp/xsd/Common/2.5.0\" bik=\"024501901\"></Bank></OrgAccount></Payee><BudgetIndex xmlns=\"http://roskazna.ru/gisgmp/xsd/Payment/2.5.0\" status=\"20\" paytReason=\"0\" taxPeriod=\"0\" taxDocNumber=\"02;XАЯ123456\" taxDocDate=\"0\"></BudgetIndex><AccDoc xmlns=\"http://roskazna.ru/gisgmp/xsd/Payment/2.5.0\" accDocNo=\"118\" accDocDate=\"2023-05-31\"></AccDoc></ImportedPayment>";
        String fullDoc = "0200000000000XАЯ123456643";
        System.out.println(imp.contains(fullDoc));
    }
    public static String newFullDoc(String fullDoc) {
        String newString = "1" + fullDoc.substring(0, fullDoc.length() - 3);
        StringBuilder sb = new StringBuilder(newString);
        sb.deleteCharAt(4);
        newString = sb.toString();
        return newString;
    }
}

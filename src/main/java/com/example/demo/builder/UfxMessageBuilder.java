package com.example.demo.builder;//package builder;
//
//import java.util.Arrays;
//import lombok.AllArgsConstructor;
//import model.azericard.Application;
//import model.azericard.ClientIdt;
//import model.azericard.ClientInfo;
//import model.azericard.Contract;
//import model.azericard.ContractIdt;
//import model.azericard.DataType;
//import model.azericard.MsgData;
//import model.azericard.ObjectFor;
//import model.azericard.Parm;
//import model.azericard.PlasticInfo;
//import model.azericard.Product;
//import model.azericard.SubApplList;
//import model.azericard.UfxMsg;
//import org.springframework.stereotype.Component;
//import utility.AzericardConstants;
//
//@Component
//@AllArgsConstructor
//public class UfxMessageBuilder {
//
//    public UfxMsg setConstants(MsgData msgData){
//        return UfxMsg.builder()
//                .direction(AzericardConstants.DIRECTION)
//                .msgType(AzericardConstants.MSG_TYPE_DOC)
//                .scheme(AzericardConstants.SCHEME)
//                .version(AzericardConstants.VERSION)
//                .msgId("MSGID")
////                .app("App")
//                .msgData(msgData)
//                .build();
//    }
//
//    public MsgData setMsgData(MsgData msgData){
//        return MsgData.builder()
//                .application(setApplication(msgData.getApplication()))
//                .build();
//    }
//
//    public Application setApplication(Application application){
//        return Application.builder()
//                .regNumber("sql")
//                .institution(AzericardConstants.INSTITUTION)
//                .objectType("OBJECTTYPE")
//                .actionType("ACTIONTYPE")
//                .resultDtls(Arrays.asList(new Parm("PARM_CODE","VALUE"))) //3
////                client
//                .orderDprt(application.getOrderDprt()) //localBranchCode
//                .objectFor(setObjectFor(application.getObjectFor()))
//                .subApplList(setSubAppList(application.getSubApplList()))
//                .build();
//    }
//
//    public ObjectFor setObjectFor(ObjectFor objectFor){
//        return ObjectFor.builder()
//                .clientIdt(ClientIdt.builder().clientInfo(ClientInfo.builder().regNumber("clientRegNumber").shortName("short").build()).build()).build() //
//    }
//
//    public SubApplList setSubAppList(SubApplList subApplList){
//        return SubApplList.builder()
//                .application(setAppOfSub1());
//
//    }
//
//    public Application setAppOfSub1(){
//        Application.builder()
//                .data(setData())
//                .subApplList(setSubOfApp());
//
//
//    }
//
//    private SubApplList setSubOfApp() {
//    }
//
//    public DataType setData(){
//        return DataType.builder().contract(setContract()).build();
//
//    }
//
//    public Contract setContract(){
//        return Contract.builder()
//                .contractIdt(setContractIdt())
//                .product(setProduct())
//                .plasticInfo(setPlasticInfo())
//                .build();
//    }
//
//
//
//    private ContractIdt setContractIdt() {
//        return ContractIdt.builder()
//                .rbsNumber("rbsNumber")
//                .contractNumber("conCatRbs")
//                .build();
//    }
//
//    private Product setProduct() {
//        return Product.builder().productCode1("issuingProductCode").build();
//    }
//
//    private PlasticInfo setPlasticInfo() {
//        return PlasticInfo.builder().firstName("plasticFirstName")
//                .lastName("plasticLastName")
//                .companyName("clientCompanyName").build();
//    }
//
//
//
//}

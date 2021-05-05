package com.example.demo.mapper;


import com.example.demo.dto.ComboCardRequest;
import com.example.demo.model.azericard.AddContractInfo;
import com.example.demo.model.azericard.Application;
import com.example.demo.model.azericard.Contract;
import com.example.demo.model.azericard.ContractIdt;
import com.example.demo.model.azericard.DataType;
import com.example.demo.model.azericard.MsgData;
import com.example.demo.model.azericard.Parm;
import com.example.demo.model.azericard.PlasticInfo;
import com.example.demo.model.azericard.Product;
import com.example.demo.model.azericard.ProductionParms;
import com.example.demo.model.azericard.SubApplList;
import com.example.demo.model.azericard.UfxMsg;
import java.util.Arrays;
import java.util.UUID;
import org.mapstruct.AfterMapping;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ComboCardMapper {

//    ComboCardMapper MAPPER = Mappers.getMapper( ComboCardMapper.class );

//    @Mapping(target = "direction", constant = AzericardConstants.DIRECTION)
//    @Mapping(target = "msgType", constant = AzericardConstants.MSG_TYPE_APP)
//    @Mapping(target = "scheme", constant = AzericardConstants.SCHEME)
//    @Mapping(target = "version", constant = AzericardConstants.VERSION)
//    @Mapping(target = "app", constant = "IBAR")
//    @Mapping(target = "msgData.application.institution", constant = "0010")
//    @Mapping(target = "msgData.application.objectType", constant = "Client")
//    @Mapping(target = "msgData.application.actionType", constant = "Update")
    @Mapping(target = "msgData.application.subApplList.application.objectType", constant = "Contract")
    @Mapping(target = "msgData.application.subApplList.application.actionType", constant = "Add")
//    @Mapping(target = "msgData.application.resultDtls", expression = "java(AzericardConstants.resultDtls)")
    UfxMsg requestToUFXMsg (ComboCardRequest dto);

//    @AfterMapping
//    default void setResultDtls(@MappingTarget UfxMsg.UfxMsgBuilder ufxMsg, ComboCardRequest dto) {
////        ufxMsg.msgId(UUID.randomUUID().toString());
////        ufxMsg.msgId(UUID.randomUUID().toString());
//        ufxMsg.msgData(MsgData.builder()
//                .application(Application.builder()
//                        .institution(AzericardConstants.INSTITUTION)
//                        .objectType("Client")
//                        .actionType("Update")
//                        .regNumber(UUID.randomUUID().toString())
//                        .resultDtls(Arrays.asList(new Parm("n","v"), new Parm("n","v"), new Parm("n","v")))
//                        .subApplList(SubApplList.builder()
//                                .application(Application.builder()
//                                        .regNumber(UUID.randomUUID().toString())
//                                        .objectType("Contract")
//                                        .actionType("Add")
//                                        .data(DataType.builder()
//                                                .contract(Contract.builder()
//                                                        .contractIdt(ContractIdt.builder()
//                                                                .rbsNumber(dto.getMainCard().getRbsNumber())
//                                                                .contractNumber(String.format("010-P-%s_B", dto.getMainCard().getRbsNumber()))
//                                                        .build())
//                                                        .product(Product.builder().productCode1(dto.getMainCard().getIssuingProductCode()).build())
//                                                        .plasticInfo(PlasticInfo.builder()
//                                                                .firstName(dto.getMainCard().getCardHolderDetails().getPlasticFirstName())
//                                                                .lastName(dto.getMainCard().getCardHolderDetails().getPlasticLastName())
//                                                                .companyName(dto.getMainCard().getCardHolderDetails().getClientCompanyName())
//                                                                .build())
//                                                        .build())
//                                                .build())
//                                        .subApplList(SubApplList.builder()
//                                                .application(Application.builder()
//                                                        .regNumber(UUID.randomUUID().toString().replaceAll("-",""))
//                                                        .objectType("Contract")
//                                                        .actionType("Add")
//                                                        .data(DataType.builder()
//                                                                .contract(Contract.builder()
//                                                                        .productionParms(ProductionParms.builder()
//                                                                                .cardExpiry(dto.getMainCard().getCardExpiryDate()).build())
//                                                                        .addContractInfo(AddContractInfo.builder().baseRelationContract("Y").build())
//                                                                        .product(Product.builder().productCode1(dto.getMainCard().getProductCode()).build())
//                                                                        .plasticInfo(PlasticInfo.builder()
//                                                                                .firstName(dto.getMainCard().getCardHolderDetails().getPlasticFirstName())
//                                                                                .lastName(dto.getMainCard().getCardHolderDetails().getPlasticLastName())
//                                                                                .companyName(dto.getMainCard().getCardHolderDetails().getClientCompanyName())
//                                                                                .build())
//                                                                        .build())
//                                                                .build())
//                                                        .build())
//                                                .build())
//
//                                        .build()).build()).build())
//
//                .build());
//
////        ufxMsg.getMsgData().getApplication().getSubApplList().getApplication().setActionType("sdfsd");
//
//    }


}

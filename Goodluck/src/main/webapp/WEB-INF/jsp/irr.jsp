<%-- 
    Document   : newDuAn
    Created on : Oct 22, 2019, 7:20:09 PM
    Author     : LENOVO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>


<section class="container-fluid row">
    <div class="col-ms-3"></div>
    <table class="table table-bordered table-hover container col-sm-6">
        <thead>
            <tr>
                <th colspan="2" class="text-center"><h4><span>Tỷ suất hoàn vốn nội tại</span></h4></th>
            </tr>
            <tr>
                <th class="text-center">Chiết khấu </th>
                <th class="text-center">NPV (Triệu)</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="text-center">
                    r1= ${irr.r1}%
                </td>
                <td class="text-center">
                 <fmt:formatNumber type="number" maxFractionDigits="2" value="${irr.npv1}" />
                </td>
            </tr>
            <tr>
                <td class="text-center">
                    r2= ${irr.r2}%
                </td>
                <td class="text-center">
                   <fmt:formatNumber type="number" maxFractionDigits="2" value="${irr.npv2}" />
                </td>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <th class="text-center">
                    IRR: 
                </th>
                <th class="text-center">
                   <fmt:formatNumber type="number" maxFractionDigits="2" value="${irr.irr}" />%
                </th>
            </tr>
        </tfoot>

    </table>
    <div class="col-ms-3"></div>
</section>


<jsp:include page="include/footer.jsp"/>

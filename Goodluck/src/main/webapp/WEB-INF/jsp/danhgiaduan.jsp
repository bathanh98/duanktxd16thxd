<%-- 
    Document   : newDuAn
    Created on : Oct 22, 2019, 7:20:09 PM
    Author     : LENOVO
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  

<jsp:include page="include/header.jsp"/>

<jsp:include page="include/main-left-top.jsp"/>



<section>



    <table class="table table-hover table-doanhthu">
        <thead>

            <tr>
                <th>Giá trị hiện tại thuần(NPV)</th>

                <th>Tỷ suất nội tại(IRR)</th>

                <th>Tỷ số lợi ích(BCR)</th> 
                <th>Thời gian hoàn vốn</th> 

            </tr>
        </thead>

        <tbody>
            <tr>
                <td>
                    <fmt:formatNumber type="number" maxFractionDigits="3" value=" ${npv.npv}" />
                </td>
                <td>
                    <fmt:formatNumber type="number" maxFractionDigits="3" value=" ${npv.irr.irr}" />%
                </td>
                <td>
                    <fmt:formatNumber type="number" maxFractionDigits="3" value=" ${npv.bcr}" />
                </td>
                <td>
                    ${npv.pp.nam} năm, ${npv.pp.thang} tháng
                </td>
               
            </tr>

        </tbody>



    </table>
</section>

<jsp:include page="include/footer.jsp"/>

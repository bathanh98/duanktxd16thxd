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


<section>
    <table class="table table-bordered table-hover table-doanhthu container">
        <thead>
            <tr>
                <th>Năm</th>

                <th>Chi phí</th>
                <th>Doanh thu</th>
                <th>Dòng tiền</th>

                <th>(1+r)^n</th>
                <th>NPVt</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="npvt" items="${npv.listNPV}">

                <tr>
                    <td>
                        ${npvt.nam}
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.COFt}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${npvt.CIFt}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${npvt.pv}" />
                    </td>
                    <td>

                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.chietKhau}" />
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="  ${npvt.npvt}" />
                    </td>
                </tr>


            </c:forEach>

            <tr>
                <th colspan="5">Giá Trị hiện tại thuần(NPV)</th>
                <td>            <b><i><fmt:formatNumber type="number" maxFractionDigits="3" value="${npv.npv}" /> triệu</i></b>
                </td>
            </tr>

        </tbody>

    </table>
</section>


<jsp:include page="include/footer.jsp"/>
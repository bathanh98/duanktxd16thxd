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


<section class="container-fluid">
    <table class="table table-bordered table-hover container">
        <thead>
            <tr>
                <th colspan="5">
                   Bảng Tỷ số lợi ích BCR
                </th>
            </tr>
            <tr>
                <th>
                    Năm
                </th>
                <th>
                    Doanh thu(CIFt)
                </th>
                <th>
                    NPV_CIFt
                </th>
                <th>
                    Chi phí(COFt)
                </th>
                <th>
                    NPV_COFt
                </th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="npvt" items="${npv.listNPV}">
                <tr>
                    <td>
                        ${npvt.nam}
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.CIFt}" />
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.CIFt/npvt.chietKhau}" />

                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.COFt}" />
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.COFt/npvt.chietKhau}" />
                    </td>
                </tr>
            </c:forEach>

            <tr>
                <td>

                </td>
                <td>
                    <b>Tổng NPV_CIF</b>
                </td>
                <td>
                    <span><b><fmt:formatNumber type="number" maxFractionDigits="3" value="${npv.npvCIF}" /></b></span>

                </td>
                <td>
                    <b>Tổng NPV_COF</>
                </td>
                <td>
                    <span><b><fmt:formatNumber type="number" maxFractionDigits="3" value="${npv.npvCOF}" /></b></span>

                </td>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <th colspan="3">Tỷ số lợi ích (NPV_CIF/NPV_COF)</th>
                <td colspan="2">
                    BCR= <fmt:formatNumber type="number" maxFractionDigits="3" value="${npv.bcr}" />
                </td>
            </tr>
        </tfoot>


    </table>
</section>


<jsp:include page="include/footer.jsp"/>

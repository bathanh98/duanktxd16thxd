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
                <th colspan="3">
                    Bảng tính thời gian hoàn vốn
                </th>
            </tr>
            <tr>
                <th>
                    Năm
                </th>
                <th>
                    Dòng tiền(PV)
                </th>
                <th>
                    Dòng tiền tích lũy
                </th>

            </tr>
        </thead>
        <tbody>

            <c:forEach var="npvt" items="${npv.listNPV}" varStatus="tagStatus">


                <tr>
                    <td>
                        ${npvt.nam}
                    </td>
                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${npvt.pv}" />
                    </td>


                    <td>
                        <fmt:formatNumber type="number" maxFractionDigits="3" value="${listpvtichluy[tagStatus.index]}" />
                    </td>



                </tr>
            </c:forEach>


        </tbody>
        <tfoot>
            <tr>
                <td>
                    <b>PP: </b>
                </td>
                <td colspan="2">
                    <span><b>
                            ${npv.pp.nam} năm, ${npv.pp.thang} tháng
                        </b></span>
                </td>

            </tr>
        </tfoot>


    </table>
</section>


<jsp:include page="include/footer.jsp"/>

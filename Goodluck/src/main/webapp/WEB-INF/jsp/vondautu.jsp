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
    <div class="col-md-6">
        <table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th colspan="2">Vốn đầu tư</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>
                        Id nguồn vốn
                    </th>
                    <td>
                       ${vondautu.id}
                    </td>
                </tr>
                <tr>
                    <th>
                        Vốn tự có
                    </th>
                    <td>
                       ${vondautu.vonTuCo} triệu
                    </td>
                </tr>
                 <tr>
                    <th>
                        Chi phí vốn tự có
                    </th>
                    <td>
                       ${vondautu.chiPhiVonTuCo}%
                    </td>
                </tr>
                 <tr>
                    <th>
                        Vốn vay
                    </th>
                    <td>
                       ${vondautu.vonVay} triệu
                    </td>
                </tr>
                 <tr>
                    <th>
                        Chi phí vốn vay
                    </th>
                    <td>
                       ${vondautu.chiPhiVonVay}$
                    </td>
                </tr>
                 <tr>
                    <th>
                        Thời gian vay vốn
                    </th>
                    <td>
                       ${vondautu.thoiGianVayVon}
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

    <div class="col-md-3"></div>
</section>


<jsp:include page="include/footer.jsp"/>

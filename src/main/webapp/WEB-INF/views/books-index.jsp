<%@ page contentType="text/html; charset=utf-8"%><%@ page pageEncoding="utf-8"%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%><!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title><spring:message code="appName" /></title>
    <style>
      table {border-collapse: collapse;}
      th, td {padding: 4px; border: 1px solid #ccc;}
    </style>
  </head>
  <body>

    <h1><spring:message code="appName" /></h1>
    <section>
      <h2>(1) String オブジェクト</h2>
      <p>
        こんにちは、<span><c:out value="${yourName}" /></span> さん。
      </p>
    </section>

    <section>
      <h2>(2) 単一の Book オブジェクト</h2>
      <dl>
        <dt>ISBN</dt>
        <dd><c:out value="${book.isbn}" /></dd>
        <dt>Title</dt>
        <dd><c:out value="${book.title}" /></dd>
        <dt>Publisher</dt>
        <dd><c:out value="${book.publisher}" /></dd>
      </dl>
    </section>

    <section>
      <h2>(3) 複数の Book オブジェクト</h2>
      <table>
        <thead>
          <tr>
            <th>ISBN</th>
            <th>Title</th>
            <th>Publisher</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${books}" var="book">
          <tr>
            <td><c:out value="${book.isbn}" /></td>
            <td><c:out value="${book.title}" /></td>
            <td><c:out value="${book.publisher}" /></td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
    </section>

  </body>
</html>

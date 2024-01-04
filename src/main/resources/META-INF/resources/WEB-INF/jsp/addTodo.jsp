<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">
    <form:form method="post" modelAttribute="todo">
        <h1>Enter Todo</h1>

        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-danger"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" path="targetDate" required="required"/>
            <form:errors path="targetDate" cssClass="text-danger"/>
        </fieldset>

        <fieldset class="mb-3">
            <form:label path="done" cssClass="mr-3">Done</form:label>
            <form:checkbox path="done" cssClass="form-check-input"/>
            <form:errors path="done" cssClass="text-danger"/>
        </fieldset>

        <form:input type="hidden" path="id"/>
        <input type="submit" class="btn btn-success">
    </form:form>
</div>

<%@ include file="common/footer.jspf" %>

<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd',
    });
</script>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form>
	<input type="hidden" name="id" value="${settings.id }">
	<div class="form-group row">
		<label for="inputEmail3" class="col-sm-2 col-form-label">网站域名</label>
		<div class="col-sm-10">
			<input type="text" name="siteDomain" value="${settings.siteDomain }" class="form-control" placeholder="http://www.1709d.com">
		</div>
	</div>
	<div class="form-group row">
		<label for="inputEmail3" class="col-sm-2 col-form-label">网站名称</label>
		<div class="col-sm-10">
			<input type="text" name="siteName" value="${settings.siteName }" class="form-control" placeholder="今日头条">
		</div>
	</div>
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="button" class="btn btn-primary" onclick="save()">保存设置</button>
		</div>
	</div>
</form>
<script type="text/javascript">
	function save() {
		$.post("/admin/settings/save",$("form").serialize(),function(res){
			if(res.result){
				relaod();
			}else{
				alert(res.message);
			}
		});
	}
</script>

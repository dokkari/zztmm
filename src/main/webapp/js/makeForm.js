/**
 * makeForm.js
 */
$(document).ready(function() {
	//실장시에는 타입에 따라 페이지 분기. 목업에서만 넥스트역할
	$(".chooseType").click(function() {
		var formType = $(this).data("formType");
		console.log(formType + " clicked");
		var step = $(this).parent().hide().attr("id").slice(-1);
		$("#step" + ++step).show();
	});
	$(".next").click(function() {
		var step = $(this).parent().parent().hide().attr("id").slice(-1);
		$("#step" + ++step).show();
	})
});
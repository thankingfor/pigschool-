$(function(){
	//点击“以其他方式答谢”选项时，将酬金设为只读
	$('#single_RewardInOtherWay').click(function(){
		if($('#single_RewardInOtherWay').prop("checked")){
			$('#single_reward').val('');
			$('#single_reward').prop({disabled:true});
		}else{
			$('#single_reward').prop({disabled:false});
		}
	})	
	$('#nav-tab a').click(function(){
		$('#nav-tab a').removeClass('bg-primary text-light');
		$(this).addClass('bg-primary text-light');
	})
	
	//薪资水平单位
	$('#work_payWay').change(function(){
		switch(this.selectedIndex){
			case 1:
				$("#work_reward_unit").text('元 / 周');
				break;
			case 2:
				$("#work_reward_unit").text('元 / 月');
				break;
			case 3:
				$("#work_reward_unit").text('元 / 小时');
				break;
			case 4:
				$("#work_reward_unit").text('元 / 工期');
				break;
			default :
				$("#work_reward_unit").text('元 / 天');
				break;
		}
	})
	
	///表单验证
	//验证input标签类型为text的控件
	//若文本框中的内容需要为纯数字类型，需要对文本框添加class="must_num"
	$(".fake_submit").click(function(){
		var $verify_group = ($(this).parent().parent().parent());
		var $input = $verify_group.find("input");
		//定义文本框对象数组
		var $input_text = new Array();
		//定义错误文本框对象数组
		var $data_wrong = new Array();
		//获取text文本框，放入$input_text数组
		$input.each(function(){
			if($(this).attr("type") == "text"){
				//排除“以其他方式答谢”选项被勾选时对该文本框的验证
				if($(this).attr("id") == "single_reward"){
					if(!$("#single_RewardInOtherWay").prop("checked")){
						$input_text.push($(this));
						$(this).css("border", "1px solid #ced4da");
					}
				}else{
					$input_text.push($(this));
					$(this).css("border", "1px solid #ced4da");
				}
			}
		})
    
    
		//判断输入内容是否为数字
		var $input_text_must_num = $verify_group.find(".must_num");
		$input_text_must_num.each(function(){
			//排除“以其他方式答谢”选项被勾选时对该文本框的验证
			if($(this).attr("id") == "single_reward"){
				if(!$("#single_RewardInOtherWay").prop("checked")){
					var verify_num = $(this).val();
					if(checkNumber(verify_num)){
						$(this).css("border", "1px solid red");
						$("#alert_box").text("填写数据必须为纯数字");
						$data_wrong.push($(this));
					}
				}
			}
			else{
				var verify_num = $(this).val();
				if(checkNumber(verify_num)){
					$(this).css("border", "1px solid red");
					$("#alert_box").text("填写数据必须为纯数字");
					$data_wrong.push($(this));
				}
			}
			
		})
		///验证字符串是否是数字
		function checkNumber(theObj) {
			var reg = /^[0-9]+.?[0-9]*$/;
			if(reg.test(theObj)) {
				return false;
			}
			return true;
		}
		
		//判断输入内容是否为空
		for(var i=0; i<$input_text.length; i++){
			if($input_text[i].val()==""){
				$data_wrong.push($input_text[i]);
				$input_text[i].css("border", "1px solid red");
				$("#alert_box").text("有未填写信息");
			}
		}
		
		
		if($data_wrong.length > 0){
			$("#alert_box").animate({bottom: "-1rem"}, 500)
			.delay(1000).animate({bottom: "-5rem"}, 500);
			$('html, body').animate({
            scrollTop: $data_wrong[0].offset().top - 50
        	}, 500);
			return false;
		}else{
			return true;
		}
	})
	
})

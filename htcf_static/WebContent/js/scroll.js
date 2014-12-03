$(function(){ 
	var page= 1; 
	var i = 4;    //number of visible tabs 

	//scroll to right
	$("#right_button").click(function(){ 
	
	var v_wrap = $(this).parents(".useful_container"); 

	var v_show = v_wrap.find(".scroll_list"); 


	var v_cont = v_wrap.find(".scroll_container");

	var v_width = v_cont.width(); 


	var len = v_show.find(".useful_tab").length; 

	

	var page_count = Math.ceil(len+1-i); 

	

	if(!v_show.is(":animated")){ 
		if(page == page_count){ 
			v_show.animate({left:'0px'},"slow"); 
			page =1; 
		}else{ 
			v_show.animate({left:'-='+v_width/i},"slow"); 
			page++; 

		} 
	} 
}); 

	//scroll to left
	$("#left_button").click(function(){ 

	var v_wrap = $(this).parents(".useful_container"); 

	var v_show = v_wrap.find(".scroll_list"); 

	var v_cont = v_wrap.find(".scroll_container"); 

	var v_width = v_cont.width(); 

	var len = v_show.find(".useful_tab").length;

	var page_count = Math.ceil(len+1-i); 

	if(!v_show.is(":animated")){ 
		if(page == 1){ 
			v_show.animate({left:'-='+ v_width*(page_count-1)/i},"slow"); 
			page =page_count; 
		}else{ 
			v_show.animate({left:'+='+ v_width/i},"slow"); 
			page--; 
		} 
	} 
}); 
}); 
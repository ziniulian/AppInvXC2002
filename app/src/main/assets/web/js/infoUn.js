
dat.flush = function () {
    if (dat.tag.pro && dat.tag.pro.memo) {
        content.innerHTML = dat.tag.pro.memo;
    } else {
	    content.innerHTML = "标签类型不符 ： " + dat.tag.cod;
    }
};

function iFrameHeight() {
    var ifm= document.getElementById("main-frame");
    var subWeb = document.frames ? document.frames["main-frame"].document : ifm.contentDocument;
    if(ifm != null && subWeb != null) {
        ifm.height = subWeb.body.scrollHeight;
        ifm.width = "100%";
    }
}
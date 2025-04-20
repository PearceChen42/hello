<?php

$mb_string = "阿斯顿654";
var_dump(mb_strlen($mb_string));

$url = "https://www.bilibili.com/video/BV1U2zwYoEBX?spm_id_from=333.788.player.switch&vd_source=bea8c46fb29ec937b480ff54c7ee8ae8&p=47";

var_dump(urlencode($url));
var_dump(urldecode(urlencode($url)));

$html = '<p>This is "quoted" text & a <a href="#">link</a>.</p>';

var_dump(htmlentities($html));

var_dump(base64_encode("Hello World!"));
<?php
var_dump($_GET);
renderView('contact_get',['csrf_token' => getCurrentCsrfToken()]);
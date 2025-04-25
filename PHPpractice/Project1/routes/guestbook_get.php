<?php

$enteries = getMessages(connectDb());

renderView('guestbook_get',
    ['messages' => $enteries]    
);
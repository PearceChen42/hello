<?php
$name = "John";
echo "Hello, $name!\n";
echo 'Hello, $name\n';

$heredoc =  <<<EOD
asldkjasdlkjasdlkasjd
asdfoihfsdngoihn
cvbcvb
dfghdfgdfyjyjyhjhjhgghfghfgh
ttttttt
multi-line string
with variable
 $name \n
EOD;

$nowdoc = <<<'EOD'
Multi-line string
with out variable $name \n

EOD;

echo $heredoc;
echo $nowdoc;
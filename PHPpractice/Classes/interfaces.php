<?php


interface PaymentProcessor {
    public function processPayment(float |int $amount): bool;
    public function refundPayment(float | int $amount): bool;
}

abstract class OnlineProcessor implements PaymentProcessor{
    public function __construct(
        protected readonly string $apiKey
    )
    {      
    }
    abstract protected function validateApiKey():bool;
    abstract protected function executePayment(float |int $amount): bool;
    abstract protected function executeRefund(float | int $amount): bool;
    public function processPayment(float | int $amount): bool {
        
        if(!$this->validateApiKey()) {
            throw new Exception("Invalid API key");
        } else {return $this->executePayment($amount);}
        
    }
    public function refundPayment(float |int $amount): bool {
        if(!$this->validateApiKey()) {
            throw new Exception("Invalid API key");
        }
        return $this -> executeRefund($amount);
    }
}

final class StripeProcessor  extends OnlineProcessor {
    protected function validateApiKey():bool{
        
        return strlen($this->apiKey) == 3;
    }
    function executePayment(float | int $amount): bool
    {
        echo "ExecutePayment $amount dollar!\n";
        return true;
    }
    function executeRefund(float | int $amount): bool
    {
        echo "Executerefund $amount!";
        return true;
    }
    
}

class PayPalProcessor extends OnlineProcessor {
    function validateApiKey():bool{
        return strlen($this->apiKey) == 32;
    }
    function executePayment(float | int  $amount): bool
    {
        echo "ExecutePayment $amount dollar!\n";
        return true;
    }
    function executeRefund(float | int $amount): bool
    {
        echo "Executerefund $amount!";
        return true;
    }
}

class OrderProcessor
{
    public function __construct(private PaymentProcessor $paymentProcessor)
    {     }
    public function processOrder(float $amount): void
    {
        if ($this->paymentProcessor->processPayment($amount)) {
            echo "Order processed sucessfully\n";
        } else {
            echo "Order processing failed\n";
        }
    }
    public function refundOrder(float $amount): void{
        //..
        if ($this->paymentProcessor->refundPayment($amount)) {
            echo "Order refunded successfully\n";

        } else {
            echo "Order refund failed\n";
        }
    }
}



$stripeProcessor = new StripeProcessor("key");
$paypalProcessor = new PayPalProcessor("valid_paypal_apikey_32chars_long");

$stripeOrder = new OrderProcessor($stripeProcessor);
$paypalOrder = new OrderProcessor($paypalProcessor);

$paypalProcessor->processPayment(500);
$stripeOrder ->processOrder(500.00);
$paypalOrder ->refundOrder(500.00);

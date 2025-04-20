<?php
declare (strict_types = 1);

$products = [
    ['name' => 'T-shirt','color' => 'red', 'size' => 'medium'],
    ['name' => 'Jeans','color' => 'blue', 'size' => 'large'],
    ['name' => 'Sweater','color' => 'green', 'size' => 'small'],
    ['name' => 'Dress','color' => 'red', 'size' => 'small'],
    ['name' => 'Jacket','color' => 'red', 'size' => 'medium']

];

$color = $_GET['color'] ?? '';
$size = $_GET['size'] ?? '';

function isSelected(string $compare, string $to): string {
    return $compare == $to ? 'selected':'';
}

$filteredProducts = array_filter($products,fn(array $product): bool =>($color=='' || $product['color']==$color && '' ==$size || $product['size'] == $size));
?>

<html>
    <body><h1>Filter Products</h1>
    <form method="GET">
        <label>Color</label>
        <select name = "color" id = "color">
            <option value="">Any</option>
            <option value="red"<?=isSelected($color, 'red')?>>red</option>
            <option value="green"<?=isSelected($color, 'green')?>>green</option>
            <option value="blue"<?=isSelected($color, 'blue')?>>blue</option>
        </select>
        <label>Size</label>
        <select name = "size" id = "size">
            <option value="">Any</option>
            <option value="small"<?=isSelected($color, 'small')?>>small</option>
            <option value="medium"<?=isSelected($color, 'medium')?>>medium</option>
            <option value="large"<?=isSelected($color, 'large')?>>large</option>
        </select>

        <button type="submit">Fillter</button>
    </form>
        <a href="<?=$_SERVER['PHP_SELF']?>">Reset Filter</a>
        <h2>Products</h2>
        <?php if (!empty($filteredProducts)): ?>

        <ul>
            <?php foreach($filteredProducts as $product): ?>
                <li>
                    <?=htmlspecialchars($product['name'])?>
                    - Color: <?=htmlspecialchars($product['color'])?>
                    , Size: <?=htmlspecialchars($product['size'])?>
                </li>
            <?php endforeach; ?>
        </ul>
        
        <?php else: ?>
            <p>No products found matching the selected criteria!</p>
        <?php endif ?>
</body>
</html>
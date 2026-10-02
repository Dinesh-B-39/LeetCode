SELECT *
FROM products
WHERE description COLLATE utf8mb3_bin REGEXP '^SN[0-9]{4}-[0-9]{4}$'
    OR description COLLATE utf8mb3_bin REGEXP ' SN[0-9]{4}-[0-9]{4} '
   OR description COLLATE utf8mb3_bin REGEXP ' SN[0-9]{4}-[0-9]{4}$'
   OR description COLLATE utf8mb3_bin REGEXP '^SN[0-9]{4}-[0-9]{4} '
ORDER BY product_id;
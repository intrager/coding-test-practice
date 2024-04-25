select tree.ITEM_ID, info.ITEM_NAME
from ITEM_TREE tree
inner join ITEM_INFO info
        on info.ITEM_ID = tree.ITEM_ID
where tree.PARENT_ITEM_ID is null
order by tree.ITEM_ID;
-- 코드를 입력하세요
SELECT
    a.BOOK_ID,
    b.AUTHOR_NAME,
    date_format(a.PUBLISHED_DATE, "%Y-%m-%d") as PUBLISHED_DATE
FROM 
    BOOK as a
JOIN AUTHOR as b
ON a.AUTHOR_ID = b.AUTHOR_ID
WHERE a.CATEGORY = '경제'
order by    
    a.PUBLISHED_DATE asc
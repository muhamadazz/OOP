document.addEventListener('DOMContentLoaded', () => {
    fetch('http://localhost:8080/api-books/get-books')
        .then(response => response.json())
        .then(data => {
            const bookList = document.getElementById('book-list');
            data.forEach(book => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${book.idbook}</td>
                    <td>${book.title}</td>
                    <td>${book.author}</td>
                    <td>${book.isbn}</td>
                    <td>${book.category}</td>
                    <td>${book.description}</td>
                    <td>${book.qty}</td>
                    <td>${book.booked}</td>
                `;
                bookList.appendChild(row);
            });
        })
        .catch(error => console.error('Error:', error));
});
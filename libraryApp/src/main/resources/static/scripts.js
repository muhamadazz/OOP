document.addEventListener('DOMContentLoaded', () => {
    fetch('http://localhost:8080/get-books')
        .then(response => response.json())
        .then(data => {
            const bookList = document.getElementById('book-list');
            data.forEach(book => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${book.name}</td>
                    <td>${book.isbn}</td>
                    <td>${book.category}</td>
                    <td>${book.title}</td>
                    <td>${book.description}</td>
                    <td>${book.qty}</td>
                `;
                bookList.appendChild(row);
            });
        })
        .catch(error => console.error('Error:', error));
});

document.addEventListener('DOMContentLoaded', () => {
    fetch('http://localhost:8080/api/member')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            const memberList = document.getElementById('member-list');
            data.forEach(member => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${member.name}</td>
                    <td>${member.email}</td>
                    <td>${member.idnumber}</td>
                    <td>${member.address}</td>
                    <td>${member.phone}</td>
                `;
                memberList.appendChild(row);
            });
        })
        .catch(error => console.error('Error:', error));
});

document.getElementById('register-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const member = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        idnumber: document.getElementById('idnumber').value,
        address: document.getElementById('address').value,
        phone: document.getElementById('phone').value
    };

    fetch('http://localhost:8080/api/member', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(member)
    })
    .then(response => response.json())
    .then(data => {
        alert('Member registered successfully!');
        window.location.href = 'index.html';
        document.getElementById('registration-form').reset();
    })
    .catch(error => console.error('Error:', error));
});

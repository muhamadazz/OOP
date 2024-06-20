document.addEventListener('DOMContentLoaded', () => {
    fetch('http://localhost:8080/api/transaction')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            const transactionList = document.getElementById('transaction-list');
            data.forEach(transaction => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${transaction.id}</td>
                    <td>${transaction.date}</td>
                    <td>${transaction.idmember}</td>
                    <td>${transaction.idbook}</td>
                    <td>${transaction.status}</td>
                `;
                transactionList.appendChild(row);
            });
        })
        .catch(error => console.error('Error:', error));
});

document.getElementById('transaction-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const transaction = {
        date: document.getElementById('date').value,
        idmember: document.getElementById('idmember').value,
        idbook: document.getElementById('idbook').value,
        status: document.getElementById('status').value
    };

    fetch('http://localhost:8080/api/transaction', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(transaction)
    })
        .then(response => response.json())
        .then(data => {
            alert('Transaction added successfully!');
            window.location.href = 'index.html';
            document.getElementById('transaction-form').reset();
        })
        .catch(error => console.error('Error:', error));
});

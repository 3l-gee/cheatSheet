import axios from 'axios';

const BASE_URL = 'http://localhost:8000/app/';

const api = axios.create({
  baseURL: BASE_URL,
});

// Function to handle GET requests
export const fetchData = async (endpoint) => {
  try {
    const response = await api.get(endpoint);
    return response.data;
  } catch (error) {
    console.error(`Error fetching data from ${endpoint}:`, error);
    throw error; // Propagate the error to the calling function/component
  }
};

// Function to handle POST requests
export const postData = async (endpoint, data) => {
  try {
    const response = await api.post(endpoint, data);
    return response.data;
  } catch (error) {
    console.error(`Error posting data to ${endpoint}:`, error);
    throw error; // Propagate the error to the calling function/component
  }
};

// Add more functions for other HTTP methods (PUT, DELETE, etc.) if needed

export default api;
